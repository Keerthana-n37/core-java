class StoreScooterNames
{
	String[] scooterNames;
	int currentIndex;
	
	StoreScooterNames(String[] scooterNames)
	{
		this.scooterNames = scooterNames;
	}
	
	void getScooterName(String scooterName)
	{
		System.out.println("Executing the getScooterName in StoreScooterNames");
		System.out.println("Scooter name:" + scooterName);
		
		if(this.scooterNames != null)
		{
			int index = this.scooterNames.length - 1;
			System.out.println("Length:" + index);
			
			if(this.currentIndex <= index)
			{
				this.scooterNames[currentIndex] = scooterName;
				System.out.println("Scooter stored at:" + this.currentIndex);
				currentIndex++;
				System.out.println("Storing another scooterName in index:" + this.currentIndex);
			}
			else{
				System.out.println("scooterNames array is full");
			}
		}
		else{
			System.out.println("scooterNames array null");
		}
	}
	
	boolean searchScooterName(String scooterName)
	{
		if(scooterName != null)
		{
			System.out.println("Searching for the " + scooterName + " in array");
			
			if(this.scooterNames != null)
			{
				System.out.println("Searching starts by comparing the names in array");
				
				for(String name : this.scooterNames)
				{
					System.out.println("Comparing " + scooterName + " with " + name);
					
					if(name == scooterName)
					{
						System.out.println("Name found in the array...");
						return true;
					}
				}
				
				System.out.println("Name not found in the array...");
			}
			else{
				System.out.println("scooterNames array is null");
			}
		}
		else{
			System.out.println("scooterName is null, search cannot be done");
		}
		return false;
	}
	
	boolean update(int index, String newName)
	{
		System.out.println("Update by Index");

		if(this.scooterNames != null)
		{
			if(index >= 0 && index < this.scooterNames.length)
			{
				if(newName != null)
				{
					System.out.println("Old value: " + this.scooterNames[index]);
					this.scooterNames[index] = newName;
					System.out.println("Updated to: " + newName);
					return true;
				}
				else{
					System.out.println("New name is null");
				}
			}
			else{
				System.out.println("Invalid index");
			}
		}
		else{
			System.out.println("Array is null");
		}
		return false;
	}
	
	boolean update(String oldName, String newName)
	{
		System.out.println("Update by Name");

		if(this.scooterNames != null)
		{
			if(oldName != null && newName != null)
			{
				int index = 0;

				for(String name : this.scooterNames)
				{
					if(name != null && name== oldName)
					{
						this.scooterNames[index] = newName;
						System.out.println("Updated " + oldName + " to " + newName);
						return true;
					}
					index++;
				}

				System.out.println("Old name not found");
			}
			else{
				System.out.println("Names cannot be null");
			}
		}
		else{
			System.out.println("Array is null");
		}
		return false;
    }
	
	
	String delete(int index)
	{
		System.out.println("Delete by Index");

		if(this.scooterNames != null)
		{
			if(index >= 0 && index < this.scooterNames.length)
			{
				if(this.scooterNames[index] != null)
				{
					String deleted = this.scooterNames[index];
					this.scooterNames[index] = null;

					System.out.println("Deleted: " + deleted + " at index: " + index);
					return deleted;
				}
				else{
					System.out.println("No value at index");
				}
			}
			else{
				System.out.println("Invalid index");
			}
		}
		else{
			System.out.println("Array is null");
		}

		return null;
	}
	
	String delete(String name)
	{
		System.out.println("Delete by Name");

		if(this.scooterNames != null)
		{
			if(name != null)
			{
				int index = 0;

				for(String value : this.scooterNames)
				{
					if(value != null && value == name)
					{
						String deleted = this.scooterNames[index];
						this.scooterNames[index] = null;

						System.out.println("Deleted: " + deleted + " at index: " + index);
						return deleted;
					}
					index++;
				}

				System.out.println("Name not found");
			}
			else{
				System.out.println("Name is null");
			}
		}
		else{
			System.out.println("Array is null");
		}

		return null;
	}
}