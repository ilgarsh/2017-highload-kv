package ru.mail.polis.ilgarsh;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.NoSuchElementException;

public interface MyDAO {
    @NotNull
    byte[] get(@NotNull String key) throws NoSuchElementException, IllegalArgumentException, IOException;

    void upsert(@NotNull String key, @NotNull byte[] value) throws IllegalArgumentException, IOException;

    @NotNull
    void delete(@NotNull String key) throws IllegalArgumentException, IOException;
}
