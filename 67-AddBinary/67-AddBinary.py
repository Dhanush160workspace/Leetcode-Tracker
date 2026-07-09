# Last updated: 7/9/2026, 3:11:04 PM
class Solution(object):
    def addBinary(self, a, b):
        #num1 = int(a,2)
        #num2 = int(b,2)
        #total = num1 + num2
        #return bin(total)[2:]
        result = ""
        carry = 0

        # Make both strings equal length by padding with zeros
        max_len = max(len(a), len(b))
        a = a.zfill(max_len)
        b = b.zfill(max_len)

        # Start adding from the rightmost bit
        for i in range(max_len - 1, -1, -1):
            bit_a = int(a[i])
            bit_b = int(b[i])

            # Binary addition logic
            total = bit_a + bit_b + carry
            if total == 0:
                result = "0" + result
                carry = 0
            elif total == 1:
                result = "1" + result
                carry = 0
            elif total == 2:
                result = "0" + result
                carry = 1
            else:  # total == 3
                result = "1" + result
                carry = 1

        # If there's a leftover carry
        if carry:
            result = "1" + result

        return result
