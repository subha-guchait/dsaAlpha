var validateStackSequences = function(pushed, popped) {
    let st = [];
    let j=0;
    for(let i=0; i<pushed.length; i++){
        st.push(pushed[i]);
        while(st.length && st[st.length-1] == popped[j]){
            st.pop();
            j++;
        }
    }
    return !st.length;
};