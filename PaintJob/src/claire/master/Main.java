package claire.master;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        int bucketCount = 0;

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else{
            double area = width * height;
            bucketCount = (int)Math.round(area / areaPerBucket - extraBuckets);
        }

        return bucketCount;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        int count = 0;
        if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double area = width * height;
            count = (int)Math.ceil(area / areaPerBucket);
        }
        return count;
    }
}
