# designpattern

## Strategy Pattern
Problems without strategy patterns:
1. If super class has some behavior/method then you are providing that behavior to other sub classes even though they don’t have that behavior.
2. If 2 or more subclasses are having same behavior then in that case, the code either becomes duplicate or you will have to create another hierarchy.
3. Sharing behaviors horizontally is not possible. Solution to problem with inheritance is not more inheritance.
