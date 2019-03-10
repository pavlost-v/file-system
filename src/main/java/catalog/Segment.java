package catalog;

public class Segment {

    private int firstBlock;
    private int secondBlock;
    // 5 слов(заголовок) лежат в блоке 1, записи о файлах(8слов) лежат в остальном месте
    // длина слова 3 байта, вмещается 42 записи в 1 сегменте

}