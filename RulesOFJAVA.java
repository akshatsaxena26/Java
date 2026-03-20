// RULES IN Patterns

/*
 * .1. IF VALUE IS NOT CHANGING IN SAME ROW THEN THINK OF 'I'TO PRINT IT.
 * 
 * .2.IF VALUE IS NOT CHANGING IN COLOUMN THEN THINK OF 'J' TO PRINT IT.
 * 
 * .3. MID FORMULAE MID =(N/2) +1.
 * 
 * FORMULAE
 * oddno.sq =(2*i)+1;
 * num=(n-i)+1;
 * 
 * FOR HIGHER VALUE TO LOWER VALUE
 * 
 * For Higher Value to Lower Value Sequence num = n*(n+1)/2
 * 
 * like -
 * 15
 * 14 13
 * 12 11 10
 * 9 8 7 6
 * 5 4 3 2 1
 * 
 * 
 * 
 * 
 * 
 * 
 * For odd Sequence for positive num = num + 2*i+1; (M--)
 *  1
 * 3 2
 * 6 5 4
 * 10 9 8 7
 * 15 14 13 12 11
 * 
 * 
 * 
 * For odd Sequence in negative num = num - (2*i+1); (M++)
 *  15
 * 13 14
 * 10 11 12
 * 6 7 8  9
 * 1 2 3 4 5
 * 
 * 
 * 1
 * 2 1
 * 3 2 1 num=i;
 * 4 3 2 1
 * 
 * 4
 * 3 4 num=n-i+1;
 * 2 3 4
 * 1 2 3 4
 * 
 * 
 * WHEN WE NEED TO FIND ROW AND COLOUMN MID
 * 
 * ROW MID = (N/2)+1
 * 
 * COLOUMN MID = (PatternsSIZE/2) +1
 * 
 * 
 * 
 */