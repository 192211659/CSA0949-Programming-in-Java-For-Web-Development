class NumArray {
    private int[] nums;
    private int[] segmentTree;
    private int n;

    public NumArray(int[] nums) {
        this.nums = nums;
        this.n = nums.length;
        this.segmentTree = new int[n * 4]; // Allocate space for the segment tree
        buildSegmentTree(0, 0, n - 1);
    }

    // Build the segment tree
    private void buildSegmentTree(int node, int start, int end) {
        if (start == end) {
            segmentTree[node] = nums[start]; // Leaf node will have a single element
        } else {
            int mid = (start + end) / 2;
            buildSegmentTree(2 * node + 1, start, mid); // Left child
            buildSegmentTree(2 * node + 2, mid + 1, end); // Right child
            segmentTree[node] = segmentTree[2 * node + 1] + segmentTree[2 * node + 2]; // Internal node
        }
    }

    // Update the segment tree
    public void update(int index, int val) {
        updateSegmentTree(0, 0, n - 1, index, val);
    }

    private void updateSegmentTree(int node, int start, int end, int index, int val) {
        if (start == end) {
            nums[index] = val; // Update the value in the original array
            segmentTree[node] = val; // Update the segment tree
        } else {
            int mid = (start + end) / 2;
            if (start <= index && index <= mid) {
                updateSegmentTree(2 * node + 1, start, mid, index, val); // Update left child
            } else {
                updateSegmentTree(2 * node + 2, mid + 1, end, index, val); // Update right child
            }
            segmentTree[node] = segmentTree[2 * node + 1] + segmentTree[2 * node + 2]; // Update internal node
        }
    }

    // Sum range query
    public int sumRange(int left, int right) {
        return querySegmentTree(0, 0, n - 1, left, right);
    }

    private int querySegmentTree(int node, int start, int end, int left, int right) {
        if (right < start || end < left) {
            return 0; // Out of range
        }
        if (left <= start && end <= right) {
            return segmentTree[node]; // Fully in range
        }
        int mid = (start + end) / 2;
        int sumLeft = querySegmentTree(2 * node + 1, start, mid, left, right); // Query left child
        int sumRight = querySegmentTree(2 * node + 2, mid + 1, end, left, right); // Query right child
        return sumLeft + sumRight; // Combine results
    }
}

public class Main {
    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{1, 3, 5});
        System.out.println(numArray.sumRange(0, 2)); // Output: 9
        numArray.update(1, 2); // nums = [1, 2, 5]
        System.out.println(numArray.sumRange(0, 2)); // Output: 8
    }
}
