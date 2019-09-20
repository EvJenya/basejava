/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    private Resume[] storage = new Resume[10000];

    void clear() {
        int size = this.size();
        for (int i = 0; i < size; i++) {
            storage[i] = null;
        }
    }

    void save(Resume r) {
        if (r.uuid != null) {
            int size = this.size();
            storage[size] = r;
        }
    }

    Resume get(String uuid) {
        Resume r = null;
        int size = this.size();
        for (int i = 0; i < size; i++) {
            if (storage[i].uuid.equals(uuid)) {
                r = storage[i];
                break;
            }
        }
        return r;
    }

    void delete(String uuid) {
        int size = this.size();
        for (int i = 0; i < size; i++) {
            if (storage[i].uuid.equals(uuid)) {
                storage[i] = storage[size - 1];
                storage[size - 1] = null;
                break;
            }
        }
    }
    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        int size = this.size();
        Resume[] result = new Resume[this.size()];
        System.arraycopy(storage, 0, result, 0, size);
        return result;
    }

    int size() {
        int size = 0;
        for (Resume element : storage) {
            if (element != null) {
                size++;
            } else
                break;
        }
        return size;
    }
}
