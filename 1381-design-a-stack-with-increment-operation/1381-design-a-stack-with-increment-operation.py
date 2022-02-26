class CustomStack:

    def __init__(self, maxSize: int):
        self.maxSize = maxSize
        self.stack = []
        self.increments = []

    # Simple to understand
    def push(self, x: int) -> None:
        if len(self.stack) < self.maxSize:
            self.stack.append(x)
            self.increments.append(0)


    def pop(self) -> int:
        if self.stack:

            # Say increments is: [0,0,0,5,0,0,0,9]
            # This means increment the first four elements by 5 and also the first eight element by 9
            # Since 9 is present only once but it affetcs all the elements before it
            # Hence we'll pop and increment the new last element by 9, now the effect of 9 will still carry on
            lastIncrement = self.increments.pop()
            
            # This if handles the case to retain 9's effect on previous elements
            # After this new increments will be: [0,0,0,5,0,0,9]
            if self.increments:
                self.increments[-1] += lastIncrement
            
            # And now we can simply pop the last element, add the last increment and return it
            return self.stack.pop() + lastIncrement
        
        return -1

    def increment(self, k: int, val: int) -> None:
        if self.stack:
            # Make the last element += val 
            # So when we pop them this will increment all the elements of the stack
            if k >= len(self.stack):
                self.increments[-1] += val
            
            # Make last element of the fist k elements += val
            # So when we pop them this will increment only the first k elements
            else:
                self.increments[k-1] += val