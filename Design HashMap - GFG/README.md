# Design HashMap
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Design a HashMap&nbsp;without using any built-in hash table libraries.</span></p>

<p><span style="font-size:18px">To be specific, your design should include these functions:</span></p>

<ul>
	<li><span style="font-size:18px"><code>put(key, value)</code>&nbsp;:&nbsp;Insert a (key, value) pair into the HashMap. If the value already exists in the HashMap, update the value.</span></li>
	<li><span style="font-size:18px"><code>get(key)</code>: Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.</span></li>
	<li><span style="font-size:18px"><code>remove(key)</code>&nbsp;:&nbsp;Remove the mapping for the value key if this map contains the mapping for the key.</span><br>
	&nbsp;</li>
</ul>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>n = 8
put(1,1)&nbsp;
put(2,2)
get(1)&nbsp;
get(3)
put(2,1)&nbsp;
get(2)
remove(2)
get(2)
<strong>Output: 
</strong>1
-1
1
-1<strong>
Explanation: 
</strong></span></pre>

<pre><span style="font-size:18px">MyHashMap hashMap = new MyHashMap();
hashMap.put(1, 1);// Now the value of key 1 is 1. &nbsp; &nbsp; &nbsp; &nbsp;
hashMap.put(2, 2);// Now the value of key 2 is 2. 
hashMap.get(1);// returns 1
hashMap.get(3);// returns -1 (not found)
hashMap.put(2, 1);// update the existing value of key 2 to 1.
hashMap.get(2);// returns 1 
hashMap.remove(2);// remove the mapping for 2.
hashMap.get(2);// returns -1 (not found)</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>n = 3
put(1,1)&nbsp;
put(2 2)
get(2)
<strong>Output: </strong>
2<strong>
Explanation:
</strong>hashMap.put(1,1)//<strong> </strong>Now the value of key 1 is 1.
hashMap.put(2,2)// Now the value of key 2 is 2.
hashMap.get(2)// Returns 2. &nbsp; &nbsp;</span>
</pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You only need to <strong>complete </strong>the provided function <strong>put(), remove(),&nbsp;get().&nbsp;</strong></span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(1) for&nbsp;<strong>put(), remove(),&nbsp;get().</strong><br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(n) for&nbsp;<strong>put(), remove(),&nbsp;get().</strong></span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= q&nbsp;&lt;= 10<sup>4</sup><br>
1 &lt;= key&nbsp;&lt;= 10<sup>4</sup></span></p>
</div>