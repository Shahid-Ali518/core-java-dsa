package leetcode;

// given an array sort its max chunks so, it would be sorted that array
// like [1,0,2,3,4,6,5], sort chunk1[1,0], chunk2[2,3], chunk3[4], chunk4[6,5]
// max chunks are 4
// i have to check if max values of array it its index also

public class maxChunksSort {

    public static int findMaxChunksSort(int[] array){
        int max = 0, chunks= 0;

        for(int i = 0; i < array.length; i++){

            max = Math.max(max, array[i]);

            if(max == i)
                chunks++;
        }

        return chunks;
    }

    public static void main(String[] args) {

        int[] array = {1,0,3,2,4,6,5};

        int chunks = findMaxChunksSort(array);

        System.out.println("Chunks: " + chunks);

    }
}
