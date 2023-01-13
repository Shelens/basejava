import java.util.Arrays;

/**
 * Array based storage for Resumes
 */

public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int storageSize = size();

    void clear() {
        for (int i = 0; i < storageSize; i++) {
            storage[i] = null;
        }
        storageSize = 0;
    }

    void save(Resume r) {
        storage[storageSize] = r;
        storageSize = storageSize + 1;

    }

    Resume get(String uuid) {
        Resume resume = null;
        for (Resume res : storage) {
            if (res != null && res.uuid.equals(uuid)) {
                resume = res;
            }
        }
        return resume;
    }

    void delete(String myUuid) {
        for (int i = 0; i < storageSize; i++) {
            if (storage[i] != null && storage[i].uuid.equals(myUuid)) {
                int index = i;
            }
        }
        for (int i = 0; i < storageSize - 1; i++) {
            storage[i] = storage[i + 1];
        }
        storage[storageSize - 1] = null;
        storageSize--;
    }


    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        Resume[] allResumes = Arrays.copyOf(storage, storageSize);
        return allResumes;
    }

    int size() {
        int count = 0;
        for (Resume res : storage) {
            if (res != null) ++count;
        }
        return count;
    }
}
