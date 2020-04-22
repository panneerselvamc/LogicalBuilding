# LogicalBuilding
Bacis.doc will have complexity details for Java Collections

1. FindingMajorityElement
    
    Problem:
        Finding the element which is repeated more than n/2(size) of the array.
        
    Sample I/O:
        Input:
            5(Size)
            1
            2
            2
            2
            3
        Output:
            THE MAJORITY ELEMENT IS: 2
            
    Description:
        Usually to find majority element we will go for O(n^2) complexity[If we are not using hashmap]
        but by using our approach we can solve using the complexity O(n) [Finding the element] + O(n) [Verifying the element]
        
2. FindingMissedLeastPositiveInteger
    
    Problem:
        Find the missing least positive integer in an array(least positive integer is 1 not 0)    
        
    Sample I/O:
    
        Input:
            PLEASE ENTER THE SIZE OF THE ARRAY
            5
            ENTER THE VALUES
            1
            3
            4
            5
            6
        Output:
            MISSING POSITIVE LEAST INTEGER: 2
            
    Description:
        We can achieve the same(.contains) in list as well, but complexity is O(n^2), so we used HashSet 
        
             


 
 
