const itemsList = () => {
  const dummy = [
    "타이타닉",
    "사랑과 영혼",
    "아바타",
    "매트릭스",
    "올빼미",
    "스파이더맨",
    "어벤져스",
    "범죄도시",
    "신과함께",
    "오베라는남자",
    "아바타:물의길",
    "간신",
    "명량",
    "한산도",
    "배트맨",
    "인디아나존스:레이더스",
  ];
  return (
    <div className=" grid grid-cols-4 grid-rows-4">
      {dummy.map((item, i) => (
        <div className=" p-10 border text-2xl">
          <div className=" font-bold">{item}</div>
        </div>
      ))}
    </div>
  );
};

export default itemsList;
