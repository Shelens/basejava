import java.util.Arrays;

/**
 * Array based storage for Resumes
 */

public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int storageSize;

    void clear() {
        for (int i = 0; i < storageSize; i++) {
            storage[i] = null;
        }
        storageSize = 0;
    }

    void save(Resume r) {
        storage[storageSize] = r;
        storageSize++;

    }

    Resume get(String uuid) {
        for (int i = 0; i < storageSize; i++) {
            if (storage[i].uuid.equals(uuid)) return storage[i];
        }
        return null;
    }

    void delete(String myUuid) {
        int index = -1;
        for (int i = 0; i < storageSize; i++) { // 1 2 3
            if (storage[i].uuid.equals(myUuid)) {
                index = i;
            }
        }
        if (index != -1) {
            for (int i = index; i < storageSize - 1; i++) {  //1 2 3
                storage[i] = storage[i + 1];
            }
            storage[storageSize - 1] = null;
            storageSize--;
        } else {
            System.out.println("resume not found");
        }
    }


    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        return Arrays.copyOf(storage, storageSize);

    }

    int size() {
        return storageSize;
    }
}
