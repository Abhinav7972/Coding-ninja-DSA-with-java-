top = 0, bottom = rows-1;
left = 0, right = cols-1;

// Correct loop condition
while (left <= right && top <= bottom) {

    // 1st iteration: left to right
    for(i = left; i <= right; i++)
        print(a[top][i]);
    top++;

    // 2nd iteration: top to bottom
    for(i = top; i <= bottom; i++)
        print(a[i][right]);
    right--;

    // 3rd iteration: right to left
    if (top <= bottom) {
        for(i = right; i >= left; i--)
            print(a[bottom][i]);
        bottom--;
    }

    // 4th iteration: bottom to top
    if (left <= right) {
        for(i = bottom; i >= top; i--)
            print(a[i][left]);
        left++;
    }
}



Input Matrix:

text
1  2  3
4  5  6
7  8  9
Dry Run Steps:

Initialize: top = 0, bottom = 2, left = 0, right = 2
Spiral Traversal:
Left to Right on top row:
Print 1 2 3
(top = 1)

Top to Bottom on right column:
Print 6 9
(right = 1)

Right to Left on bottom row:
Print 8 7
(bottom = 1)

Bottom to Top on left column:
Print 4
(left = 1)

Left to Right on inner row:
Print 5

Spiral Output:
1 2 3 6 9 8 7 4 5