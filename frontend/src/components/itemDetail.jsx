const itemDetail = ({
  title,
  genres,
  director,
  image,
  pubYear,
  userRating,
  description,
}) => {
  return (
    <div className=" bg-black h-full">
      <h1 className=" bg-black text-white text-xl p-3">
        {title || "movie title"}
      </h1>
      <div className=" w-full h-[450px] relative">
        <img
          src={image || "https://picsum.photos/id/237/200/300"}
          alt=""
          className="
          w-full h-[450px]"
        ></img>
        <div className=" absolute bottom-0">
          <div className=" flex m-3 ml-5 ">
            <div>
              <img
                src={image || "https://picsum.photos/id/237/200/300"}
                alt="movie thumnail"
                className=" w-[200px] h-[300px]"
              ></img>
            </div>
            <div className=" relative">
              <div className=" flex justify-between absolute bottom-0 left-3 w-[500px] bg-[#9b4de4] rounded-full p-4 pl-10">
                <div>
                  <div className=" text-white font-bold text-4xl">
                    {title || "movie title asdasdasdasdasd"}
                  </div>
                  <div className=" text-white text-lg">
                    genre1, genre2, genre3, genre4
                  </div>
                </div>
                <div className=" text-white text-[48px] w-[100px] self-center text-center flex">
                  <svg
                    xmlns="http://www.w3.org/2000/svg"
                    width="50"
                    height="50"
                    fill="currentColor"
                    class="bi bi-star-fill"
                    className=" self-center"
                    viewBox="0 0 16 16"
                  >
                    <path d="M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z" />{" "}
                  </svg>
                  {userRating || 4.8}
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      {/* <div className=" bg-[#a05edf] rounded-xl p-1 m-4 ">
        <p className="  text-white text-2xl font-bold">개요</p>
        <span className=" text-white">{description || "줄거리입니다."}</span>
      </div> */}
      <div className=" bg-[#a05edf] rounded-xl p-1 m-4">
        <p className=" text-white text-2xl font-bold">감독</p>
        <span className=" text-white">{director || "감독명"}</span>
      </div>
      <div className=" bg-[#a05edf] rounded-xl p-1 m-4">
        <p className=" text-white text-2xl font-bold">출시일</p>
        <span className=" text-white">{director || "출시일"}</span>
      </div>
    </div>
  );
};

export default itemDetail;
