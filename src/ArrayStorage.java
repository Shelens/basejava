import java.util.Arrays;

/**
 * Array based storage for Resumes
 */

public class ArrayStorage {
    Resume[] storage = new Resume[10000];


    void clear() {
        for (int i = 0; i <  storage.length; i++){
            storage[i] = null;
        }
    }

    void save(Resume r) {
            storage[size()] = r;

    }

    Resume get(String uuid)  {
        Resume resume = null;
        for (Resume res : storage){
            if (res != null && res.uuid.equals(uuid)){
                resume = res;
            }
        }
        return resume;
    }

    void delete(String myUuid) {
        for (int i = 0; i < storage.length; i++){
            if (storage[i] != null && storage[i].uuid.equals(myUuid)){
                int index = i;
            }
        }
        for (int i = 0; i < storage.length-1; i++){
            storage[i] = storage[i+1];
        }
        storage[storage.length-1] = null;
        }


    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        Resume[] allResumes = Arrays.copyOf(storage, size());
        return allResumes;
    }

    int size() {
        int count = 0;
        for(Resume res : storage){
            if (res != null) ++count;}
        return count;
    }
}
