import java.util.ArrayList;

public class Exercises {

  public int findMe(int[] list, int target) {
	  if (target!=null && list[]!=null) {
		  for (var i=0; i<list.size();i++) {
			  if (list.get(i) == target) {
				  return i;
			  }
		  }
	  }
	  
	  return -1;
  }

  public int findMe(ArrayList<String> list, String target) {
	  if (list.contains(null) || list == null || target == null) {
          return -1;
      }
	  for (int i = 0; i < list.size(); i++) {
          if (list.get(i).equals(target)) {
              return i;
          }
      }
	  return -1;
  }

  public int findMeFaster(ArrayList<Integer> list, int target) {
	  if (list.contains(null) || list == null || target == null) {
          return -1;
      }
	  int start = 0;
      int end = list.size()-1;
      int middle = 0;
      while (start <= end) {
          middle = (start+end) / 2;

          if (list.get(middle) < target) {
              start = middle + 1;
          } else if (list.get(middle) > target) {
              end = middle-1;
          } else {
              return middle;
          }
      }
	  
	  return -1;
  }

  public int findMeFaster(String[] list, String target) {
	  if (Arrays.asList(list).contains(null) || Arrays.asList(list) == null || target == null) {
		return -1;
	  }
	  
	  int start = 0;
	  int end = list.size() - 1;
	  int standard = -1;
	  while (start <= end) {
		int middle = (start + end) / 2;
		if (list.get(middle) < target) {
			start = middle + 1;
		} else if (list.get(middle) > target) {
			end = middle - 1;
		} else if (list.get(middle) == target) {
			standard = middle;
			break;
		}
	  }
	  return -1;
  }

  public int[] bubble(int[] list, boolean ascending) {
	  if (Arrays.asList(list).contains(null) || Arrays.asList(list) == null) {
			return null;
		}
	  
	  for (int i = 0; i < list.length - 1; i++) {
			for (int j = 0; j < list.length - i - 1; j++) {
				if (list[j] > list[j+1]) {
					int temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
	  }
	  
	  	if (!ascending) {
			int i, t;
			int n = list.length;
			for (i = 0; i < n / 2; i++) {
				t = list[i];
				list[i] = list[n-i-1];
				list[n-i-1] = t;
			}
		}

		return list;
  }

  public ArrayList<String> bubble(ArrayList<String> list, boolean ascending) {
	  if (list.contains(null) || list == null) {
			return null;
		}
	  
	  for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {
				if (list.get(j).compareTo(list.get(j + 1)) > 0) {
					String temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}

		if (!ascending) {
			Collections.reverse(list);
		}

		return list;
  }

  public ArrayList<Integer> insertion(ArrayList<Integer> list, boolean ascending) {
	  if (list.contains(null) || list == null) {
			return null;
	  }
	  
	  for (int j = 1; j < list.size(); j++) {
			int temp = list.get(j);
			int i = j - 1;
			while ((i > -1) && (list.get(i) > temp)) {
				list.set(i + 1, list.get(i));
				i--;
			}
			list.set(i + 1, temp);
	  }
	  
	  if (!ascending) {
			Collections.reverse(list);
	  }

	  return list;
  }

  public String[] insertion(String[] list, boolean ascending) {
	  if (Arrays.asList(list).contains(null) || Arrays.asList(list) == null) {
			return null;
	  }
	  
	  for (int j = 1; j < list.length; j++) {
			String current = list[j];
			int i = j - 1;
			while ((i > -1) && (list[i].compareTo(current) > 0)) {
				list[i + 1] = list[i];
				i--;
			}
			list[i + 1] = current;
		}

		if (!ascending) {
			int i;
			String t;
			int n = list.length;
			for (i = 0; i < n / 2; i++) {
				t = list[i];
				list[i] = list[n - i - 1];
				list[n - i - 1] = t;
			}
		}

		return list;  
  }

  public int[] selection(int[] list, boolean ascending) {
    return null;
  }

  public ArrayList<String> selection(ArrayList<String> list, boolean ascending) {
    return null;
  }

  public ArrayList<Integer> merge(ArrayList<Integer> list, boolean ascending) {
    return null;
  }

  public String[] merge(String[] list, boolean ascending) {
    return null;
  }
}