package com.spring.clone.bean.resource;

import java.io.File;
import java.net.URI;
import java.net.URL;

public interface Resource extends InputStreamSource{
    boolean isExists();
    boolean isReadable();
    boolean isOpen();
    URL getURL();
    URI getURI();
    File getFile();
    long contentLength();

}
