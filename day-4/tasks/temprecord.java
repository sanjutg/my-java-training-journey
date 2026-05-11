package tasks;

public class temprecord {
    public static void main(String[] args) {
        float [] temp = new float[]{30.5f, 28.3f, 32.1f, 29.8f, 31.2f, 27.9f, 33.0f};
        System.out.println("Temperature Records (original):");
        for(float f : temp){
            System.out.println(f);
        }

        temp[0] = 35.0f;
         // Example of modifying an element
         temp[3] = 30.0f;
        System.out.println("Temperature Records (modified):");
        for(float f : temp){
            System.out.println(f);
        }

    }
}
