package org.gabota.neetcode;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;

public class FileReader {
    public static int[] readAsIntArray(String line) {
        String[] strings = line.split(",");
        int[] ret = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            ret[i] = Integer.parseInt(strings[i]);
        }
        return ret;
    }

    public static BufferedReader getReader(Thread currentThread, String resource) {
        ClassLoader classloader = currentThread.getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(resource);
        InputStreamReader streamReader = new InputStreamReader(Objects.requireNonNull(is));
        return new BufferedReader(streamReader);
    }
}
