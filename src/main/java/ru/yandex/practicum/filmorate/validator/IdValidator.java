package ru.yandex.practicum.filmorate.validator;

import ru.yandex.practicum.filmorate.exception.FilmNotFoundException;
import ru.yandex.practicum.filmorate.exception.UserNotFoundException;

import java.util.Collection;

public class IdValidator {
    public static void validateUserId(int id, Collection<Integer> existingId) throws UserNotFoundException {
        String msg = String.format("Unknown user: %d", id);
        if (!existingId.contains(id)) throw new UserNotFoundException(msg);
    }

    public static void validateFilmId(int id, Collection<Integer> existingId) throws FilmNotFoundException {
        String msg = String.format("Unknown film: %d", id);
        if (!existingId.contains(id)) throw new FilmNotFoundException(msg);
    }
}
