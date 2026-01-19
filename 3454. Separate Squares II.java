class Solution {
    static final int START = 1, END = -1;

    static class Event {
        int x1, x2, y, type;
        Event(int a, int b, int c, int d) {
            x1 = a; x2 = b; y = c; type = d;
        }
    }

    static class Node {
        int cnt, len;
        boolean left, right;
    }

    static class SegmentTree {
        int[] vals;
        Node[] tree;
        int n;

        SegmentTree(int[] v) {
            vals = v;
            n = v.length;
            tree = new Node[4*n];
            for (int i = 0; i < tree.length; i++) tree[i] = new Node();
        }

        void update(int l, int r, int d, int i, int L, int R) {
            if (L > r || R < l) return;
            int m = (L + R) / 2;

            if (l <= L && R <= r) {
                tree[i].cnt += d;
            } else {
                update(l, r, d, i*2, L, m);
                update(l, r, d, i*2+1, m+1, R);
            }

            if (tree[i].cnt > 0) {
                tree[i].len = vals[R] - vals[L] + 1;
                tree[i].left = tree[i].right = true;
            } else if (L == R) {
                tree[i].len = 0;
                tree[i].left = tree[i].right = false;
            } else {
                tree[i].len = tree[i*2].len + tree[i*2+1].len;
                if (tree[i*2].right && tree[i*2+1].left)
                    tree[i].len += vals[m+1] - vals[m] - 1;
                tree[i].left = tree[i*2].left;
                tree[i].right = tree[i*2+1].right;
            }
        }

        int covered() {
            return tree[1].len;
        }
    }
