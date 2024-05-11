const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm4v081/",
            name: "ssm4v081",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm4v081/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "旅游社交小程序"
        } 
    }
}
export default base
