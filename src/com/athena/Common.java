package com.athena;

import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Common {

    static final String HELLO_WORLD = "hello_world";
    private static final String PATH_RESOURCES = Paths.get("..", "..", "resources").toString(); //NON-NLS
    private static final String PATH_FORMS = "forms"; //NON-NLS

    private static URL getResource(String first, String... more) {
        List<String> all = new ArrayList<>();
        all.add(first);
        Collections.addAll(all, more);
        return Common.class.getResource(Paths.get(PATH_RESOURCES, all.toArray(new String[0])).toString());
    }

    static URL getForm(String first, String... more) {
        List<String> all = new ArrayList<>();
        all.add(first);
        Collections.addAll(all, more);
        return Common.getResource(Paths.get(PATH_FORMS, all.toArray(new String[0])).toString());
    }
}
