import React from "react";
import '../styles/Result.css';

const Result = () => {
    // fetch("https://mbti-movie.herokuapp.com/api/movie_list?mbti=entp").then((res) => res.json()).then(
    //     res => console.log(res)
    // )
    return (
        <div className="result-container">
            <div>ENTP 가 좋아할 영화</div>
        </div>
    );
}

export default Result;