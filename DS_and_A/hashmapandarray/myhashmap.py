class MyHashMap:
    def __init__(self):
        self.bucketSize = 10007
        self.bucket = [[] for _ in range(self.bucketSize)]

    def put(self, key, value):
        index = key % self.bucketSize
        for k, v in self.bucket[index]:
            if k == key:
                v = value
                return
        self.bucket[index].append((key, value))

    def get(self, key):
        index = key % self.bucketSize
        for k, v in self.bucket[index]:
            if k == key:
                return v
        return -1

    def remove(self, key):
        index = key % self.bucketSize
        self.bucket[index] = [(k, v) for k, v in self.bucket[index] if k != key]

# Example usage:
hashMap = MyHashMap()
hashMap.put(1, 1)
hashMap.put(2, 2)
print(hashMap.get(1))  # Output: 1
print(hashMap.get(3))  # Output: -1
hashMap.put(2, 1)
print(hashMap.get(2))  # Output: 1
hashMap.remove(2)
print(hashMap.get(2))  # Output: -1
