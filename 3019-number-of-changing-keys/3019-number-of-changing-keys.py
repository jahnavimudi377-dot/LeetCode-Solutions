class Solution:
    def countKeyChanges(self, s: str) -> int:
         a = s.lower()
         c =0
         for i in range(len(s)-1):
            if a[i]!=a[i+1]:
                c= c+1
         return c            