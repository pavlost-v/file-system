package filesystem;

import java.util.ArrayList;
import java.util.List;

public class Block {

    protected ArrayList<Byte> bytes;

    public final int MAX_SIZE = 512;

    public Block() {
        bytes = new ArrayList<Byte>();
    }

    /**
     * Позволяет записать в блок массив байт (добавить в конец, если есть место)
     * @param arr массив байт, который мы хотим записать в блок
     * @return количество байт, которое удалось записать
     */
    public int add (ArrayList<Byte> arr) {

        if (bytes.size() == MAX_SIZE) {
            return 0;
        }

        if (arr.size() + bytes.size() > MAX_SIZE) {
            int added = MAX_SIZE - bytes.size();
            for (int i = 0; i < added; i++) {
                bytes.add(arr.get(i));
            }
            return added;
        }

        bytes.addAll(arr);
        return arr.size();
    }

    /**
     * Возвращает срез массива байт. Нумерация с 0.
     * @param start начальный элемент (включается).
     * @param end конечный элемент (не включается
     * @return получившийся срез, либо null
     */
    public List<Byte> get(int start, int end) {

        if (start < 0) {
            return null;
        }

        if (end > bytes.size()) {
            return null;
        }

        return bytes.subList(start,end);
    }
}