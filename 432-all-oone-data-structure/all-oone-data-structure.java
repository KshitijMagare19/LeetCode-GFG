class AllOne {
    
    public class node{
        String name="";
        int val=0;
        int pos=0;

        node(String s,int key,int pos)
        {
          name=s;
          val=key;
          this.pos=pos;
        }
    }

    List<node> l=new ArrayList<>();
    Map<String,node> map=new HashMap<>();

    public AllOne() { 
    }

    public void inc(String key) {
        if(map.containsKey(key))
        {
            node temp=map.get(key);
            temp.val++;
            int pos=temp.pos;
            while(--pos>=0 && l.get(pos).val<temp.val)
            {
                l.get(pos).pos=pos+1;
                Collections.swap(l,pos+1,pos);
                temp.pos=pos;
            }
        }
        else
        {
            node temp=new node(key,1,l.size());
            l.add(temp);
            map.put(key,temp);
        }
    }
    
    public void dec(String key) {
        node temp=map.get(key);
        temp.val--;
        int pos=temp.pos;

        while(++pos<l.size() && l.get(pos).val>temp.val)
        {
            l.get(pos).pos=pos-1;
            Collections.swap(l,pos,pos-1);
            l.get(pos).pos=pos;
        }

        if(temp.val==0)
        {
            l.remove(pos-1);
            map.remove(key);
        }
    }
    
    public String getMaxKey() {
        return l.size()==0?"":l.get(0).name;
    }
    
    public String getMinKey() {
        return l.size()==0?"":l.get(l.size()-1).name;
    }
}