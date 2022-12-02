import React, {useState, useEffect} from "react";
import { useLocation } from "react-router-dom";
import '../styles/Result.css';

const Result = () => {
    const location = useLocation();
    const mbti = location.state.mbti

    const [genre, setGenre] = useState("뭘까?");
    const [movies, setMovies] = useState([]);
    useEffect(() => {
        const domain = "https://mbti-movie.herokuapp.com"

        fetch(`${domain}/api/movie_list?mbti=${mbti}`).then((res) => res.json()).then(
            res => setMovies(res.movies)
        )

        fetch(`${domain}/api/genre?mbti=${mbti}`).then((res) => res.json()).then(
            res => setGenre(res.genre)
        )
      },[mbti]);

    return (
        <div className="result-container">
            <div> 너가 좋아하는 장르는? {genre} </div>
            <div> {mbti} 가 좋아할 영화 </div>
            <ul>
                {
                    movies.map((movie, index) =>
                        <li class="movie" key={index}> {movie.title} </li>
                    )
                }
            </ul>
        </div>
    );
}

export default Result;