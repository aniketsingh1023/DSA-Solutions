#include <iostream>
#include <vector>
#include <algorithm>

class Solution {
public:
    int largestCombination(std::vector<int>& candidates) {
        int n = candidates.size();
        int max_freq = 0;

        for (int i = 0; i < 32; ++i) {
            int freq = 0;
            for (int& ele : candidates) {
                if (ele & (1 << i)) {
                    freq++;
                }
            }
            max_freq = std::max(max_freq, freq);
        }
        return max_freq;
    }
};

int main() {
    Solution solution;
    std::vector<int> candidates = {16, 17, 71, 62, 12, 24, 14};
    int result = solution.largestCombination(candidates);
    std::cout << "The largest combination frequency is: " << result << std::endl;
    return 0;
}
