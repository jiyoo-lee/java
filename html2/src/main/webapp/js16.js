function call(aa) {
   var p = {

      "person": ["김수빈", "김정민", "오유나", "김진수", "김창순", "이유림", "하윤성"],
      "Email":
         ["kim@nate.com", "jungmin@gmail.com", "ouna123@gmail.com", "kimjsu@nate.com", "soon0707@naver.com",
          "limlee@gmail.com", "hayounsong@naver.com"]
   		};
   var w = 0;
   while (w < p.person.length) {
      if (p.person[w] == aa) {
         console.log(p.person[w] + p.Email[w]);
         break;
      }
      w++;
   }
   if (p.person[w] != aa) {
      console.log("해당 사용자가 없습니다.");
   }
}