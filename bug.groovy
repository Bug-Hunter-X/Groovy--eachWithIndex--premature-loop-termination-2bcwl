```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { String item, int index ->
    println "Item $index: $item"
    if (item == "target") {
      return // This will exit the eachWithIndex loop prematurely
    }
  }
}

myMethod(['a', 'b', 'target', 'c'])
```