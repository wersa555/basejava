import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    private Resume[] storage = new Resume[10000];
    private int size = 0;

    public void clear() {
        Arrays.fill(storage, null);
    }

    public void save(Resume r) {

    }

    public void update(Resume r) {

    }

    public Resume get(String uuid) {
        for (int i = 0; i < size; i++) {
            if (uuid == storage[i].getUuid()){
                return storage[i];
            }
        }
        return null;
    }

    public void delete(String uuid) {
        for (int i = 0; i < size; i++) {
            if (uuid == storage[i].getUuid()){
                storage[i] = storage[size - 1];
                storage[size - 1] = null;
                size--;
            }
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    public Resume[] getAll() {
        return new Resume[0];
    }

    public int size() {
        return size;
    }
}
