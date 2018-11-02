package com.spring.clone.bean.resource;

import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

public abstract class AbstractResource implements Resource {

    @Override
    public boolean isReadable() {
        return true;
    }

    @Override
    public boolean isOpen() {
        return true;
    }

    @Override
    public URL getURL() {
        return null;
    }

    @Override
    public URI getURI() {
        return null;
    }

    @Override
    public File getFile() {
        return null;
    }

    @Override
    public long contentLength() {
        return 0;
    }

    @Override
    public boolean isExists() {
        try {
            return getFile().exists();
        }catch (Exception e) {
            try {
                InputStream is = getInputStream();
                is.close();
                return true;
            }
            catch (Throwable isEx) {
                return false;
            }
        }

    }
}
