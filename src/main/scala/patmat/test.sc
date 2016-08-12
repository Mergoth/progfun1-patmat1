import patmat.Huffman.Leaf

val list = List('a', 'b', 'a')

def listCounted = list.distinct.map(c => c -> list.count(_ == c))
listCounted.sortBy(_._2).map(l =>  Leaf(l._1,l._2))