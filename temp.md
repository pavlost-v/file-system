# Наброски структур и заметки

## Конфиг

1. Кол-во блоков, которое резервируется по умолчанию под временный файл
2. Количество байт, отводимое под 1 слово

## Каталог

```java

public class Segment {
	private int firstBlock;
	private int secondBlock;
	// 5 слов(заголовок) лежат в блоке 1, записи о файлах(8слов) лежат в остальном месте
	// длина слова 3 байта, вмещается 42 записи в 1 сегменте
}

public class Catalog {
	private ArrayList<Segment> segments;
	private int countSegments;

	// findFreeSpace - поиск свободного места
	// addTempFile - создание временного файла
}
```

## Файловая система

```java

public class FileSystem {
	private final int totalBlockCount; // сколько блоков было всего выделено под систему

	private ArrayList<Block> systemBlocks;

	private Catalog catalog;

	private ArrayList<Block> dataBlocks;
}

```