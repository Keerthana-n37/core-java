class ProfileStore
{
    Profile[] profiles;
    int indexPosition = 0;

    ProfileStore(Profile[] profiles)
    {
        this.profiles = profiles;
    }

    void saveProfile(Profile profile)
    {
        System.out.println("Running saveProfile method");

        if(this.profiles!= null && profile!= null)
        {
            System.out.println("Profile array is available");

            int lastIndex =this.profiles.length-1;

            if(indexPosition <= lastIndex)
            {
                this.profiles[this.indexPosition] = profile;
                System.out.println("Profile saved at index: " +this.indexPosition);
                this.indexPosition++;

                profile.displayProfileDetails();
            }
            else
            {
                System.out.println("Profile storage is full");
            }
        }
        else
        {
            System.out.println("Profile array or object is null");
        }
    }
}