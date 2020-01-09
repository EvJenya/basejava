package com.basejava.webapp.storage;

import com.basejava.webapp.storage.serializer.DataStreamSerializer;

public class DataPathStorageTest extends AbstractStorageTest{

    DataPathStorageTest(Storage storage) {
        super(new PathStorage(STORAGE_DIR.getAbsolutePath(), new DataStreamSerializer()));
    }
}
