const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot9n107/",
            name: "springboot9n107",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot9n107/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "新闻稿件管理系统"
        } 
    }
}
export default base
