# Интерфейсы, которые необходимо будет реализовать

## Общая информация
Класс Monitor транслирует все команды FileSystem.

Предлагаю команде FileSystem написать интерфейс для Catalog.

## Файловая система
```java
interface FileSystem{

	// Петя и Ваня
	void Dir(String ... params);
    void Squeeze();
    // + конструктор

    // Дима, Оля, Денис, Антон
    int Enter(String fileName, int sizeFile);
    int Open(String fileName);
    int Read(int blockNumber, String fileName);
    int Write(Block block, String fileName);
    int Close(String fileName);
    int Rename(String fileName, String newType);
    int Delete(String fileName);

}
```

## Каталог
```java
interface Catalog{
	// Здесь вам нужно дописать самим ;)
}
```