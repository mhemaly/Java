package com.mycompany.mavenproject1.utils;

import java.util.Iterator;

public interface CloseableIterator<E> extends Iterator<E>, AutoCloseable {

}
