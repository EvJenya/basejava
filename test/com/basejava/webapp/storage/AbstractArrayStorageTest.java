package com.basejava.webapp.storage;

import com.basejava.webapp.exception.StorageException;
import com.basejava.webapp.model.Resume;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

abstract class AbstractArrayStorageTest extends AbstractStorageTest{

    public AbstractArrayStorageTest(Storage storage) {
        super(storage);
    }

    @Test
    void saveOverflow() {
        assertThrows(StorageException.class, () -> {
            try {
                for (int i = 4; i <= AbstractArrayStorage.STORAGE_LIMIT; i++) {
                    storage.save(new Resume("Name "+i));
                }
            } catch (StorageException e) {
                fail();
            }
            storage.save(new Resume("OverFlow"));
        });
    }
}
