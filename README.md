# Effective Java

# 생성자 대신 정적 팩터리 메서드를 사용할 수 없는지 생각해 보라
- 이름이 있음, 호출할때 Singleton, 반환값 자료형의 하위 자료형 객체를 반환 가능하다.
- 형인자 자료형 객체를 만들때 편함

```java
public static <K, V> HashMap<K, V> new Instance() {
    return new HashMap<K, V>();
}

Map<String, List<String>> m = hashMap.newInstance();
```

- 단점, 하위 클래스 생성 불가. 새로운 인스턴스는 생성 불가하기 때문에
- 정적 팩터리 메서드가 다른 정적 메서드와 확연히 구분되지 않음
 
 # 생성자 인자가 많을때, Builder 패턴 적용을 고려하라.