#include <iostream>
#include <vector>
#include <climits>

int findSecondLargest(const std::vector<int>& arr) {
    int largest = INT_MIN;
    int secondLargest = INT_MIN;
    for (int num : arr) {
        if (num > largest) {
            secondLargest = largest;
            largest = num;
        } else if (num > secondLargest && num != largest) {
            secondLargest = num;
        }
    }

    return (secondLargest == INT_MIN) ? -1 : secondLargest; 
}
int main() {
    std::vector<int> arr = {12, 35, 1, 10, 34, 1};
    int result = findSecondLargest(arr);
    if (result != -1) {
        std::cout << "The second largest element is: " << result << std::endl;
    } else {
        std::cout << "No valid second largest element found." << std::endl;
    }

    return 0;
}
