package com.company.service.impl;

import com.company.entity.user.User;
import com.company.repository.UserRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {
    public static final String USER_EMAIL = "alex@gmail.com";
    public static final String USER_PASSWORD = "password";

//    private UserRepository userRepository = new UserRepository() {
//        @Override
//        public User findByUserId(Long userId) {
//            return new User(1L, "alex@gmail.com", "password");
//        }
//
//        @Override
//        public User findByUserEmail(String email) {
//            return null;
//        }
//    };

    @Mock
    private UserRepository userRepository;
    @InjectMocks
    private UserServiceImpl userService;

    @Test
    public void shouldReturnUserById(){
        when(userRepository.findByUserId(1L)).thenReturn(new User(1L, USER_EMAIL, USER_PASSWORD));

        User actual = userService.findUserById(1L);
        User expected = new User(1L, "alex@gmail.com", "password");

        assertEquals(expected, actual);  // ok only if equals() is overridden

//        assertUser(expected, actual);
    }

    private void assertUser(User expected, User actual) {
        assertEquals(expected.getUserId(), actual.getUserId());
        assertEquals(expected.getEmail(), actual.getEmail());
        //....
    }

@Ignore
    @Test(expected = RuntimeException.class)
    public void shouldReturnUserById1(){
        when(userRepository.findByUserId(1L)).thenThrow(RuntimeException.class);

        userService.findUserById(2L); // exception here

//        User expected = new User(1L, "alex@gmail.com", "password");

//        assertEquals(expected, actual);

    }



    @Test
    public void shouldReturnTrueIfPasswordsAreEquals(){
        String emailMock = "alex@gmail.com";
        String passwordMock = "password";
        when(userRepository.findByUserEmail(emailMock)).thenReturn(new User(1L, emailMock, passwordMock));

        String actualPassword = userRepository.findByUserEmail(emailMock).getPassword();
        boolean actual = userService.login(emailMock, actualPassword);

        assertTrue(actual);
    }

    @Test
    public void shouldReturnFalseIfPasswordsAreNotEquals(){
        String emailMock = "alex@gmail.com";
        String passwordMock = "password";
        when(userRepository.findByUserEmail(emailMock)).thenReturn(new User(1L, emailMock, passwordMock));

        String actualPassword = passwordMock+"bla";
        boolean actual = userService.login(emailMock, actualPassword);

        assertFalse(actual);
    }

    @Test
    public void userShouldBeSaved(){
        User user = new User(1L, USER_EMAIL, USER_PASSWORD);
//      mock   (userRepository.save(user))
//      verify   verify(userRepository.save(user));

        doNothing().when(userRepository).save(user);
        userService.save(user);
//        verify(userRepository, times(1)).save(user);
        verify(userRepository).save(user); // times(1) by default

    }

    @Test
    public void shouldNotSaveNullValue(){  // not ask repository if user == null
        User user = new User(1L, USER_EMAIL, USER_PASSWORD);

        doNothing().when(userRepository).save(null);
        userService.save(null);
//        verify(userRepository, times(0)).save(null);
        Mockito.verifyZeroInteractions(userRepository);  // ok if any methods was invoked

    }

}