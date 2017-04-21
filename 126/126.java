public class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        boolean found = false;
        Queue<Node> q = new LinkedList<Node>();
        Node begin = new Node(beginWord);
        q.add(begin);
        ArrayList<Node> nodeArr = new ArrayList<Node>();
        List<List<String>> ans = new ArrayList<List<String>>();
        for (String word : wordList){
            Node node = new Node(word);
            nodeArr.add(node);
        }
        while (!q.isEmpty()){
            Node first = q.peek();
            for (String node : wordList){
                if (check(first.word, node) && !first.pre.contains(node)){
                    if (node.equals(endWord)){
                        found = true;
                        List<String> aAns = new ArrayList<String>();
                        aAns.addAll(first.pre);
                        aAns.add(first.word);
                        aAns.add(endWord);
                        ans.add(aAns);
                        break;
                    }else if (!found){
                        Node newNode = new Node(node);
                        newNode.pre.addAll(first.pre);
                        newNode.pre.add(first.word);
                        q.add(newNode);
                    }
                }
            }
            q.poll();
        }
        
        for (int i = 0; i < ans.size(); i++){
        	int min = ans.get(0).size();
        	if (ans.get(i).size() > min){ans.remove(ans.get(i));i--;}
        }
        return ans;
    }
    
    public static boolean check(String word, String next){
        int len = word.length();
        int diffNum = 0;
        for (int i = 0; i < len; i++){
            if (word.charAt(i) != next.charAt(i)){diffNum +=1;}
            if (diffNum > 1){break;}
        }
        if (diffNum == 1){return true;}
        else{return false;}
    }
}

class Node{
    String word;
    ArrayList<String> pre;
    Node(String word){this.word = word;pre = new ArrayList<String>();}
}
