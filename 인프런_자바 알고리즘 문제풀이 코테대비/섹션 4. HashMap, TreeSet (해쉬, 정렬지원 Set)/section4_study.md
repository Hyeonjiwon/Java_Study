1. 학급 회장(해쉬)
```java
map.getOrDefault(x, 0); // x라는 key가 없으면 0을 return
map.put(map.getOrDefault(x, 0) + 1); // x 개수 카운팅

map.containsKey('A') // return true/false
map.size() // key의 종류 개수
map.remove('A') // key 삭제
```