class Carpenter
{
    long[] woodSizes;
    Tool[] tools;

    Carpenter(long[] woodSizes, Tool[] tools)
    {
        this.woodSizes = woodSizes;
        this.tools = tools;
    }

    void display()
    {
        System.out.println("Display Carpenter Information");

        if(this.woodSizes != null)
        {
            System.out.println("Total wood sizes: " + this.woodSizes.length);
            for(long size : this.woodSizes)
            {
                System.out.println("Wood Size: " + size);
            }
        }
        else
        {
            System.out.println("Wood sizes are empty");
        }

        if(this.tools != null)
        {
            System.out.println("Total tools: " + this.tools.length);
            for(Tool tool : this.tools)
            {
                System.out.println("Tool Name: " + tool.toolName);
                System.out.println("Tool Weight: " + tool.weight);
            }
        }
        else
        {
            System.out.println("Tools are empty");
        }
    }
}