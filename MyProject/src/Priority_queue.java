import java.util.Arrays;
import java.util.PriorityQueue;

public class Priority_queue {
    public static void main(String...args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
    }
}
class Solution {
    int getParent(int node, int[] parent){
        if(node == parent[node]) return node;
        parent[node] = getParent(parent[node], parent);
        return parent[node];
    }
    void settleRank(int u, int v, int[] rank, int[] parent){
        if(rank[u] == rank[v]){
            parent[v] = u;
            rank[u]++;
        }
        else if(rank[u] > rank[v]){
            parent[v] = u;
        }
        else{
            parent[u] = v;
        }
    }
    public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
        Arrays.sort(edgeList, (a, b) -> a[2] >= b[2] ? 1 : -1);

        int[][] newQueries = new int[n][4];
        for(int i=0; i<queries.length; i++){
            newQueries[i][0] = queries[i][0]; newQueries[i][1] = queries[i][1]; newQueries[i][2] = queries[i][2];
            newQueries[i][3] = i;
        }
        Arrays.sort(newQueries, (a, b) -> a[2] >= b[2] ? 1 : -1);
        int queryPointer = 0;
        boolean[] result = new boolean[queries.length];

        int[] rank = new int[n];
        int[] parent = new int[n];
        for(int i=0; i<n; i++) parent[i] = i;

        for(int i=0; i<edgeList.length; i++){
            int u = edgeList[i][0], v = edgeList[i][1], w = edgeList[i][2];
            u = getParent(u, parent);
            v = getParent(v, parent);
            settleRank(u, v, rank, parent);
            if(i == edgeList.length-1 || (edgeList[i+1][2] >= newQueries[queryPointer][2])){
                int a = newQueries[queryPointer][0], b = newQueries[queryPointer][1];
                if(parent[a] == parent[b]) result[newQueries[queryPointer][3]]=true;
                queryPointer++;
            }
        }
        return result;
    }
}